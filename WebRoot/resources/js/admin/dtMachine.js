$(document).ready(function() {
					$('#dtmachine').DataTable(
									{
										order: [[ 0, "desc" ]],
										ajax : {
											url : "listMachine"
										},
										columns : [
												{
													"data" : "id"
												},
												{
													"data" : "location"
												},
												{
													"data" : "ip"
												},
												{
													"data" : "name"
												},
												{
													"data" : "type"
												},
												{
													"data" : "usage"
												},
												{
													"data" : "id",
													"fnCreatedCell" : function(
															nTd, sData, oData,
															iRow, iCol) {
														$(nTd).html(
																		"<a href='javascript:void(0);' "
																				+ "onclick='_showFun(\""
																				+ oData.id
																				+ "\",\""
																				+ oData.location
																				+ "\",\""
																				+ oData.ip
																				+ "\",\""
																				+ oData.name
																				+ "\",\""
																				+ oData.type
																				+ "\",\""
																				+ oData.manager
																				+ "\",\""
																				+ oData.usage
																				+ "\",\""
																				+ oData.account
																				+ "\",\""
																				+ oData.password
																				+ "\",\""
																				+ oData.remark
																				+ "\")'>show</a>&nbsp;&nbsp;")
																				
																.append(
																		"<a href='javascript:void(0);' "
																		+ "onclick='_editFun(\""
																		+ oData.id
																		+ "\",\""
																		+ oData.location
																		+ "\",\""
																		+ oData.ip
																		+ "\",\""
																		+ oData.name
																		+ "\",\""
																		+ oData.type
																		+ "\",\""
																		+ oData.manager
																		+ "\",\""
																		+ oData.usage
																		+ "\",\""
																		+ oData.account
																		+ "\",\""
																		+ oData.password
																		+ "\",\""
																		+ oData.remark
																		+ "\")'>edit</a>&nbsp;&nbsp;"
																)
																.append(
																		"<a href='javascript:void(0);' onclick='_deleteFun("
																				+ sData
																				+ ")'>delete</a>");
													}
												}, ],

									});

					$("#btnEdit").hide();
					$("#btnAdd").click(_init);
					$("#btnSave").click(_addFun);
   				    $("#btnEdit").click(_editFunSubmit);
   				    $("#btnClose").click(refresh);
   				    $("#btnCancel").click(refresh);
   				   

				});

function _showFun(id, location, ip, name, type, manager,usage,account,password,remark) {
	$("#id").val(id);
	$("#location").val(location);
	$("#ip").val(ip);
	$("#name").val(name);
	$("#type").val(type);
	$("#manager").val(manager);
	$("#usage").val(usage);
	$("#account").val(account);
	$("#password").val(password);
	$("#remark").val(remark);
	$('#form1').attr("readonly","readonly");
	//$('#form1 textarea').attr("readonly","readonly");
	$("#mymodal").modal("toggle");
	$("#btnSave").hide();
	$("#btnEdit").hide();
	$("#btnCancel").hide();
	
}

function _editFun(id, location, ip, name, type, manager,usage,account,password,remark) {
	$("#id").val(id);
	$("#location").val(location);
	$("#ip").val(ip);
	$("#name").val(name);
	$("#type").val(type);
	$("#manager").val(manager);
	$("#usage").val(usage);
	$("#account").val(account);
	$("#password").val(password);
	$("#remark").val(remark);
	
	
	$("#mymodal").modal("toggle");
	$("#btnSave").hide();
	$("#btnEdit").show();
}

function _editFunSubmit(){
	//alert("update");
	$("#form1").submit();
}
/**
 * 删除
 * 
 * @param id
 * @private
 */
function _deleteFun(id) {
	var str = "you are going to delete bug of id : "+id;
	if(confirm(str)){
		$.ajax({
		url : "deleteMachine",
		data : {
			"machine.id" : id
		},
		type : "get",
		success : function(data) {
			alert("delete success");
			location.reload();
		},
		error : function(error) {
			console.log(error);
		}
	});
	}
}

/**
 * 初始化
 * 
 * @private
 */
function _init() {
	$("#btnEdit").hide();
	$("#btnSave").show();
	resetForm();
	$("#mymodal").modal("toggle");
}

/**
 * 添加数据
 * 
 * @private
 */
function _addFun() {
	var jsonData = {
		'machine.location' : $("#location").val(),
		'machine.ip' : $("#ip").val(),
		'machine.name' : $("#name").val(),
		'machine.type' : $("#type").val(),
		'machine.manager' : $("#manager").val(),
		'machine.usage' : $("#usage").val(),
		'machine.account' : $("#account").val(),
		'machine.password' : $("#password").val(),
		'machine.remark' : $("#remark").val(),
	};
	$.ajax({
		url : "saveMachine",
		data : jsonData,
		type : "post",
		success : function(backdata) {
				$("#myModal").modal("hide");
				alert("insert success.");
				resetForm();
		},
		error : function(error) {
			console.log(error);
		}
	});
}

/**
 * 重置表单
 */
function resetForm() {
	$('form').each(function(index) {
		$('form')[index].reset();
	});
}

function refresh(){
	location.reload();   
}
