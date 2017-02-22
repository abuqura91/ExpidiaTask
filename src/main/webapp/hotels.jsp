<%-- 
    Document   : hotels
    Created on : Feb 21, 2017, 12:01:08 AM
    Author     : abuqura
--%>

<%@page import="com.abuqura.entities.jacksonBeans.JsonRootBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="resources/design.css" />
        <title>Hotels</title>
    </head>
    <body>
        <form action="hotelInfo.jsp" method="post">
            <% JsonRootBean jsonData = (JsonRootBean) request.getAttribute("jsonRootBean");
                request.getSession().setAttribute("jsonRootBean", jsonData);
            %>
            <p style="text-align:left;color:#4682B4">
                Language: <%=jsonData.getOfferinfo().getLanguage()%>
                || 
                Currency: <%=jsonData.getOfferinfo().getCurrency()%>
                <span style="float:right;color:#4682B4">
                    User Id: <%=jsonData.getUserinfo().getUserid()%>
                </span>
            </p>
            <center><h1><p style="color:#4682B4">Hotels in <%=jsonData.getOffers().getHotel().get(0).getDestination().getCity()%> city </p></h1><br>
                <p style="color:#4682B4">To view the hotel Details, Please press on one of the numbers in the view list.
                </p></center>
            <center><table style="width: 100%">
                    <thead>
                        <tr>
                            <th scope="col" >Hotel Name</th>
                            <th scope="col">City/ Country</th>
                            <th scope="col">Star Rating</th>
                            <th scope="col">View Hotel</th>
                        </tr>
                    </thead>

                    <%
                        for (int i = 0; i < jsonData.getOffers().getHotel().size(); i++) {
                    %>
                    <tbody>
                        <tr>
                            <td><%=jsonData.getOffers().getHotel().get(i).getHotelinfo().getHotelname()%></td>
                            <td><%=jsonData.getOffers().getHotel().get(i).getDestination().getCity() + "/ " + jsonData.getOffers().getHotel().get(i).getDestination().getCountry()%></td> 
                            <td><%=jsonData.getOffers().getHotel().get(i).getHotelinfo().getHotelstarrating()%></td>
                            <td> <input type="submit" name="index" value="<%=i%>"></td>
                        </tr>
                    <tbody>

                        <%
                            }
                        %>
                </table>
            </center>
        </form>
    </body>
</html>
