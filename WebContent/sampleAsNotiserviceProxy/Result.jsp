<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAsNotiserviceProxyid" scope="session" class="com.kt.bcn.adaptor.equip.server.service.as.AsNotiserviceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAsNotiserviceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAsNotiserviceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAsNotiserviceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.kt.bcn.adaptor.equip.server.service.as.AsNotiservice getAsNotiservice10mtemp = sampleAsNotiserviceProxyid.getAsNotiservice();
if(getAsNotiservice10mtemp == null){
%>
<%=getAsNotiservice10mtemp %>
<%
}else{
        if(getAsNotiservice10mtemp!= null){
        String tempreturnp11 = getAsNotiservice10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String alarmCode_2id=  request.getParameter("alarmCode18");
        int alarmCode_2idTemp  = Integer.parseInt(alarmCode_2id);
        String alarmTime_3id=  request.getParameter("alarmTime20");
            java.lang.String alarmTime_3idTemp = null;
        if(!alarmTime_3id.equals("")){
         alarmTime_3idTemp  = alarmTime_3id;
        }
        String serviceIp_4id=  request.getParameter("serviceIp22");
            java.lang.String serviceIp_4idTemp = null;
        if(!serviceIp_4id.equals("")){
         serviceIp_4idTemp  = serviceIp_4id;
        }
        String probableCause_5id=  request.getParameter("probableCause24");
            java.lang.String probableCause_5idTemp = null;
        if(!probableCause_5id.equals("")){
         probableCause_5idTemp  = probableCause_5id;
        }
        String serverId_6id=  request.getParameter("serverId26");
            java.lang.String serverId_6idTemp = null;
        if(!serverId_6id.equals("")){
         serverId_6idTemp  = serverId_6id;
        }
        String systemId_7id=  request.getParameter("systemId28");
            java.lang.String systemId_7idTemp = null;
        if(!systemId_7id.equals("")){
         systemId_7idTemp  = systemId_7id;
        }
        String alarmType_8id=  request.getParameter("alarmType30");
        int alarmType_8idTemp  = Integer.parseInt(alarmType_8id);
        String additionalText_9id=  request.getParameter("additionalText32");
            java.lang.String additionalText_9idTemp = null;
        if(!additionalText_9id.equals("")){
         additionalText_9idTemp  = additionalText_9id;
        }
        String location_10id=  request.getParameter("location34");
            java.lang.String location_10idTemp = null;
        if(!location_10id.equals("")){
         location_10idTemp  = location_10id;
        }
        String severity_11id=  request.getParameter("severity36");
            java.lang.String severity_11idTemp = null;
        if(!severity_11id.equals("")){
         severity_11idTemp  = severity_11id;
        }
        %>
        <jsp:useBean id="com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id" scope="session" class="com.kt.bcn.adaptor.equip.server.entity.AlarmEvent" />
        <%
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setAlarmCode(alarmCode_2idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setAlarmTime(alarmTime_3idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setServiceIp(serviceIp_4idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setProbableCause(probableCause_5idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setServerId(serverId_6idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setSystemId(systemId_7idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setAlarmType(alarmType_8idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setAdditionalText(additionalText_9idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setLocation(location_10idTemp);
        com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id.setSeverity(severity_11idTemp);
        sampleAsNotiserviceProxyid.alarmEvent(com1kt1bcn1adaptor1equip1server1entity1AlarmEvent_1id);
break;
case 38:
        gotMethod = true;
        String serviceIp_13id=  request.getParameter("serviceIp43");
            java.lang.String serviceIp_13idTemp = null;
        if(!serviceIp_13id.equals("")){
         serviceIp_13idTemp  = serviceIp_13id;
        }
        String probableCause_14id=  request.getParameter("probableCause45");
            java.lang.String probableCause_14idTemp = null;
        if(!probableCause_14id.equals("")){
         probableCause_14idTemp  = probableCause_14id;
        }
        String serverId_15id=  request.getParameter("serverId47");
            java.lang.String serverId_15idTemp = null;
        if(!serverId_15id.equals("")){
         serverId_15idTemp  = serverId_15id;
        }
        String stsCode_16id=  request.getParameter("stsCode49");
            java.lang.String stsCode_16idTemp = null;
        if(!stsCode_16id.equals("")){
         stsCode_16idTemp  = stsCode_16id;
        }
        String additionalText_17id=  request.getParameter("additionalText51");
            java.lang.String additionalText_17idTemp = null;
        if(!additionalText_17id.equals("")){
         additionalText_17idTemp  = additionalText_17id;
        }
        String stsTime_18id=  request.getParameter("stsTime53");
            java.lang.String stsTime_18idTemp = null;
        if(!stsTime_18id.equals("")){
         stsTime_18idTemp  = stsTime_18id;
        }
        String systemId_19id=  request.getParameter("systemId55");
            java.lang.String systemId_19idTemp = null;
        if(!systemId_19id.equals("")){
         systemId_19idTemp  = systemId_19id;
        }
        String location_20id=  request.getParameter("location57");
            java.lang.String location_20idTemp = null;
        if(!location_20id.equals("")){
         location_20idTemp  = location_20id;
        }
        %>
        <jsp:useBean id="com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id" scope="session" class="com.kt.bcn.adaptor.equip.server.entity.StatusEvent" />
        <%
        com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id.setServiceIp(serviceIp_13idTemp);
        com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id.setProbableCause(probableCause_14idTemp);
        com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id.setServerId(serverId_15idTemp);
        com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id.setStsCode(stsCode_16idTemp);
        com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id.setAdditionalText(additionalText_17idTemp);
        com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id.setStsTime(stsTime_18idTemp);
        com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id.setSystemId(systemId_19idTemp);
        com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id.setLocation(location_20idTemp);
        sampleAsNotiserviceProxyid.statusEvent(com1kt1bcn1adaptor1equip1server1entity1StatusEvent_12id);
break;
case 59:
        gotMethod = true;
        String systemId_22id=  request.getParameter("systemId64");
            java.lang.String systemId_22idTemp = null;
        if(!systemId_22id.equals("")){
         systemId_22idTemp  = systemId_22id;
        }
        String fileSize_23id=  request.getParameter("fileSize66");
        int fileSize_23idTemp  = Integer.parseInt(fileSize_23id);
        String fileLocation_24id=  request.getParameter("fileLocation68");
            java.lang.String fileLocation_24idTemp = null;
        if(!fileLocation_24id.equals("")){
         fileLocation_24idTemp  = fileLocation_24id;
        }
        String serviceIp_25id=  request.getParameter("serviceIp70");
            java.lang.String serviceIp_25idTemp = null;
        if(!serviceIp_25id.equals("")){
         serviceIp_25idTemp  = serviceIp_25id;
        }
        %>
        <jsp:useBean id="com1kt1bcn1adaptor1equip1server1entity1TrafficEvent_21id" scope="session" class="com.kt.bcn.adaptor.equip.server.entity.TrafficEvent" />
        <%
        com1kt1bcn1adaptor1equip1server1entity1TrafficEvent_21id.setSystemId(systemId_22idTemp);
        com1kt1bcn1adaptor1equip1server1entity1TrafficEvent_21id.setFileSize(fileSize_23idTemp);
        com1kt1bcn1adaptor1equip1server1entity1TrafficEvent_21id.setFileLocation(fileLocation_24idTemp);
        com1kt1bcn1adaptor1equip1server1entity1TrafficEvent_21id.setServiceIp(serviceIp_25idTemp);
        sampleAsNotiserviceProxyid.trafficEvent(com1kt1bcn1adaptor1equip1server1entity1TrafficEvent_21id);
break;
case 72:
        gotMethod = true;
        String time_27id=  request.getParameter("time77");
            java.lang.String time_27idTemp = null;
        if(!time_27id.equals("")){
         time_27idTemp  = time_27id;
        }
        String serviceIp_28id=  request.getParameter("serviceIp79");
            java.lang.String serviceIp_28idTemp = null;
        if(!serviceIp_28id.equals("")){
         serviceIp_28idTemp  = serviceIp_28id;
        }
        String fileSize_29id=  request.getParameter("fileSize81");
        int fileSize_29idTemp  = Integer.parseInt(fileSize_29id);
        String userId_30id=  request.getParameter("userId83");
            java.lang.String userId_30idTemp = null;
        if(!userId_30id.equals("")){
         userId_30idTemp  = userId_30id;
        }
        String fileLocation_31id=  request.getParameter("fileLocation85");
            java.lang.String fileLocation_31idTemp = null;
        if(!fileLocation_31id.equals("")){
         fileLocation_31idTemp  = fileLocation_31id;
        }
        String systemId_32id=  request.getParameter("systemId87");
            java.lang.String systemId_32idTemp = null;
        if(!systemId_32id.equals("")){
         systemId_32idTemp  = systemId_32id;
        }
        String password_33id=  request.getParameter("password89");
            java.lang.String password_33idTemp = null;
        if(!password_33id.equals("")){
         password_33idTemp  = password_33id;
        }
        String asId_34id=  request.getParameter("asId91");
            java.lang.String asId_34idTemp = null;
        if(!asId_34id.equals("")){
         asId_34idTemp  = asId_34id;
        }
        %>
        <jsp:useBean id="com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id" scope="session" class="com.kt.bcn.adaptor.equip.server.entity.FailCallEvent" />
        <%
        com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id.setTime(time_27idTemp);
        com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id.setServiceIp(serviceIp_28idTemp);
        com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id.setFileSize(fileSize_29idTemp);
        com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id.setUserId(userId_30idTemp);
        com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id.setFileLocation(fileLocation_31idTemp);
        com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id.setSystemId(systemId_32idTemp);
        com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id.setPassword(password_33idTemp);
        com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id.setAsId(asId_34idTemp);
        sampleAsNotiserviceProxyid.failCallEvent(com1kt1bcn1adaptor1equip1server1entity1FailCallEvent_26id);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>