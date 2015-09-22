require([ 'echarts', 'echarts/chart/bar', // 使用柱状图就加载bar模块，按需加载
], function(ec) {
	// 基于准备好的dom，初始化echarts图表
	var myChart1 = ec.init(document.getElementById('ec1'));
	var option1 = {
		title : {
			text : '研一出差统计',
			x : 'center'
		},
		tooltip : {
			show : true
		},
		toolbox : {
			show : true,
			feature : {
				dataView : {
					show : true,
					readOnly:true,
        	        optionToContent :function(){
            	        var str ="data format :{country => quanity} <br/>";
            	        for(var i=0;i<country.length;i++){
	            	        str+=" "+(i+1)+".  "+country[i]+" => "+countCountry[i]+"<br/>";
            	        }
            	        return str;
        	        },
				},
				saveAsImage : {
					show : true
				},
				restore : {
					show : true
				},
			}
		},
		calculable : true,
		xAxis : [ {
			type : 'category',
			data : arr_people
		} ],
		yAxis : [ {
			type : 'value'
		} ],
		series : [ {
			"name" : "quanity",
			"type" : "bar",
			itemStyle : {
				normal : {
					color : function(params) {
						// build a color map as your need.
						var colorList = [ '#C1232B', '#B5C334', '#FCCE10',
								'#E87C25', '#27727B', '#FE8463', '#9BCA63',
								'#FAD860', '#F3A43B', '#60C0DD', '#D7504B',
								'#C6E579', '#F4E001', '#F0805A', '#26C0C0',
								'#AC8463', '#9BFF63', '#FAC001', '#C0805A',
								'#A6C0C0', ];
						return colorList[params.dataIndex]
					},
					label : {
						show : true,
						position : 'top',
						formatter : '{b}\n{c}'
					}
				}
			},
			"data" : arr_number
		} ]
	};

	// 为echarts对象加载数据
	myChart1.setOption(option1);
	
	
	var myChart2 = ec.init(document.getElementById('ec2'));
	var option2 = {
		title : {
			text : '研二出差统计',
			x : 'center'
		},
		tooltip : {
			show : true
		},
		toolbox : {
			show : true,
			feature : {
				dataView : {
					show : true,
					readOnly:true,
        	        optionToContent :function(){
            	        var str ="data format :{country => quanity} <br/>";
            	        for(var i=0;i<country.length;i++){
	            	        str+=" "+(i+1)+".  "+country[i]+" => "+countCountry[i]+"<br/>";
            	        }
            	        return str;
        	        },
				},
				saveAsImage : {
					show : true
				},
				restore : {
					show : true
				},
			}
		},
		calculable : true,
		xAxis : [ {
			type : 'category',
			data : arr_people2
		} ],
		yAxis : [ {
			type : 'value'
		} ],
		series : [ {
			"name" : "quanity",
			"type" : "bar",
			itemStyle : {
				normal : {
					color : function(params) {
						// build a color map as your need.
						var colorList = [ '#C1232B', '#B5C334', '#FCCE10',
								'#E87C25', '#27727B', '#FE8463', '#9BCA63',
								'#FAD860', '#F3A43B', '#60C0DD', '#D7504B',
								'#C6E579', '#F4E001', '#F0805A', '#26C0C0',
								'#AC8463', '#9BFF63', '#FAC001', '#C0805A',
								'#A6C0C0', ];
						return colorList[params.dataIndex]
					},
					label : {
						show : true,
						position : 'top',
						formatter : '{b}\n{c}'
					}
				}
			},
			"data" : arr_number2
		} ]
	};

	// 为echarts对象加载数据
	myChart2.setOption(option2);
});