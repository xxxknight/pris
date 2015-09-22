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
																				+ "\")'>显示详情</a>&nbsp;&nbsp;");
													}
												},
																	
												
												 ],

									});
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
	$("#mymodal").modal("toggle");
}
