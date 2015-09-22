$(document).ready(function() {
					$('#dtarrange').DataTable(
									{
										order: [[ 0, "desc" ]],
										ajax : {
											url : "listArrange"
										},
										columns : [
												{
													"data" : "id"
												},
												{
													"data" : "fromtime"
												},
												{
													"data" : "totime"
												},
												{
													"data" : "travel"
												},
												{
													"data" : "quxian"
												},
												{
													"data" : "baoxiao"
												},
												{
													"data" : "meeting"
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
																				+ oData.fromtime
																				+ "\",\""
																				+ oData.totime
																				+ "\",\""
																				+ oData.travel
																				+ "\",\""
																				+ oData.quxian
																				+ "\",\""
																				+ oData.baoxiao
																				+ "\",\""
																				+ oData.meeting
																				
																				+ "\")'>edit</a>&nbsp;&nbsp;")
																.append(
																		"<a href='javascript:void(0);' onclick='_deleteFun("
																				+ sData
																				+ ")'>delete</a>");
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

function _editFun(id, fromtime, totime, travel, quxian, baoxiao , meeting) {
	$("#id").val(id);
	$("#fromtime").val(fromtime);
	$("#totime").val(totime);
	$("#travel").val(travel);
	$("#quxian").val(quxian);
	$("#baoxiao").val(baoxiao);
	$("#meeting").val(meeting);
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
	var str = "you are going to delete bug of id : "+ id;
	if(confirm(str)){
		$.ajax({
		url : "deleteArrange",
		data : {
			"arrange.id" : id
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
		'arrange.fromtime' : $("#fromtime").val(),
		'arrange.totime' : $("#totime").val(),
		'arrange.travel' : $("#travel").val(),
		'arrange.quxian' : $("#quxian").val(),
		'arrange.baoxiao' : $("#baoxiao").val(),
		'arrange.meeting' : $("#meeting").val()
	};
	$.ajax({
		url : "saveArrange",
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
