<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int ranList[] = new int[3];
	for(int idx=0;idx<3;idx++){
		ranList[idx] = (int)(Math.random()*10+1);
	}
	
	int low[] = new int[1];
	int middle[] = new int[1];
	int high[] = new int[1];
	for(int idx=0;idx<ranList.length;idx++){
		for (int idx2=idx+1;idx2<ranList.length;idx2++){
			if (ranList[idx]>ranList[idx2]){
				int max = ranList[idx];
				ranList[idx] = ranList[idx2];
				ranList[idx2] = max;
			}
		}
	}
	low[0] = ranList[0];
	middle[0] = ranList[1];
	high[0] = ranList[2];

%>

<h2><%=low[0]%></h2>
<h2><%=middle[0]%></h2>
<h2><%=high[0]%></h2>
</body>
</html>