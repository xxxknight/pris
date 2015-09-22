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
												
												 ],

									});
				});
