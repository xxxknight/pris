$(document).ready(function() {
					$('#dtbug').DataTable(
									{
										order: [[ 0, "desc" ]],
										ajax : {
											url : "listBug"
										},
										columns : [
												{
													"data" : "id"
												},
												{
													"data" : "bname"
												},
												{
													"data" : "edittime"
												},
												{
													"data" : "description"
												},
												{
													"data" : "attachment"
												},
												{
													"data" : "person"
												},
												{
													"data" : "id",
													"fnCreatedCell" : function(
															nTd, sData, oData,
															iRow, iCol) {
														$(nTd).html(
																		"<a href='javascript:void(0);' "
																				+ "onclick='_editFun(\""
																				+ oData.id
																				+ "\",\""
																				+ oData.bname
																				+ "\",\""
																				+ oData.edittime
																				+ "\",\""
																				+ oData.description
																				+ "\",\""
																				+ oData.attachment
																				+ "\",\""
																				+ oData.person
																				+ "\")'>edit</a>&nbsp;&nbsp;")
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


function _editFun(id, bname, edittime, description, attachment, person) {
	$("#id").val(id);
	$("#bname").val(bname);
	$("#edittime").val(edittime);
	$("#description").val(description);
	$("#attachment").val(attachment);
	$("#person").val(person);
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
		url : "deleteBug",
		data : {
			"bug.id" : id
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
		'bug.bname' : $("#bname").val(),
		'bug.edittime' : $("#edittime").val(),
		'bug.person' : $("#person").val(),
		'bug.attachment' : $("#attachment").val(),
		'bug.description' : $("#description").val(),
	};
	$.ajax({
		url : "saveBug",
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
