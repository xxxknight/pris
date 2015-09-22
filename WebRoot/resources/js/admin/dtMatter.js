$(document).ready(function() {
					$('#dtmatter').DataTable(
									{
										order: [[ 0, "desc" ]],
										ajax : {
											url : "listMatter"
										},
										columns : [
												{
													"data" : "id"
												},
												{
													"data" : "title"
												},
												{
													"data" : "startTime"
												},
												{
													"data" : "endTime"
												},
												{
													"data" : "assignPeople"
												},
												{
													"data" : "level"
												},
												{
													"data" : "state"
												},
												{
													"data" : "actualTime"
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
																				+ oData.title
																				+ "\",\""
																				+ oData.startTime
																				+ "\",\""
																				+ oData.endTime
																				+ "\",\""
																				+ oData.assignPeople
																				+ "\",\""
																				+ oData.state
																				+ "\",\""
																				+ oData.level
																				+ "\",\""
																				+ oData.actualTime
																				+ "\",\""
																				+ oData.content
																				+ "\")'>显示详情</a>&nbsp;&nbsp;")
																				.append(
																		"<a href='javascript:void(0);' "
																		+ "onclick='_editFun(\""
																		+ oData.id
																		+ "\",\""
																		+ oData.title
																		+ "\",\""
																		+ oData.startTime
																		+ "\",\""
																		+ oData.endTime
																		+ "\",\""
																		+ oData.assignPeople
																		+ "\",\""
																		+ oData.state
																		+ "\",\""
																		+ oData.level
																		+ "\",\""
																		+ oData.actualTime
																		+ "\",\""
																		+ oData.content
																		+ "\")'>编辑</a>&nbsp;&nbsp;"
																)
																.append(
																		"<a href='javascript:void(0);' onclick='_deleteFun("
																				+ sData
																				+ ")'>删除</a>")
																				;
													}
												},
																	
												
												 ],

									});
					$("#btnEdit").hide();
					$("#btnAdd").click(_init);
					$("#btnSave").click(_addFun);
   				    $("#btnEdit").click(_editFunSubmit);
   				    $("#btnClose").click(refresh);
   				    $("#btnCancel").click(refresh);
				});

function _showFun(id, title, startTime, endTime, assignPeople, state,level,actualTime,content) {
	$("#id").val(id);
	$("#title").val(title);
	$("#startTime").val(startTime);
	$("#endTime").val(endTime);
	$("#assignPeople").val(assignPeople);
	$("#state").val(state);
	$("#level").val(level);
	$("#actualTime").val(actualTime);
	$("#content").val(content);
	$('#form1 input').attr("readonly","readonly");
	$('#form1 textarea').attr("readonly","readonly");
	
	
	$("#btnSave").hide();
	$("#mymodal").modal("toggle");
}


function _editFun(id, title, startTime, endTime, assignPeople, state,level,actualTime,content) {
	$("#id").val(id);
	$("#title").val(title);
	$("#startTime").val(startTime);
	$("#endTime").val(endTime);
	$("#assignPeople").val(assignPeople);
	$("#state").val(state);
	$("#level").val(level);
	$("#actualTime").val(actualTime);
	$("#content").val(content);
	
	$("#mymodal").modal("toggle");
	$("#btnSave").hide();
	$("#btnEdit").show();
}

function _editFunSubmit(){
	// alert("update");
	$("#form1").submit();
}
/**
 * 删除
 * 
 * @param id
 * @private
 */
function _deleteFun(id) {
	var str = "you are going to delete matter of id : "+id;
	if(confirm(str)){
		$.ajax({
		url : "deleteMatter",
		data : {
			"matter.id" : id
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
		'matter.title' : $("#title").val(),
		'matter.startTime' : $("#startTime").val(),
		'matter.endTime' : $("#endTime").val(),
		'matter.assignPeople' : $("#assignPeople").val(),
		'matter.state' : $("#state").val(),
		'matter.level' : $("#level").val(),
		'matter.actualTime' : $("#actualTime").val(),
		'matter.content' : $("#content").val(),
	};
	$.ajax({
		url : "saveMatter",
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




