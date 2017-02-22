<%-- 
    Document   : hotelInfo
    Created on : Feb 21, 2017, 11:57:21 PM
    Author     : abuqura
--%>


<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URL"%>
<%@page import="com.abuqura.entities.jacksonBeans.JsonRootBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Info</title>
        <link type="text/css" rel="stylesheet" href="resources/design.css" />

    </head>
    <body>
        <form>
            <%JsonRootBean hotel = (JsonRootBean) request.getSession().getAttribute("jsonRootBean");
                int index = Integer.parseInt(request.getParameter("index"));
            %>
            <center>
                <h1><p style="color:#4682B4" ><%=hotel.getOffers().getHotel().get(index).getHotelinfo().getHotelname()%></p></h1>
                <img src="<%=hotel.getOffers().getHotel().get(index).getHotelinfo().getHotelimageurl()%>" height="150" width="200"></center>

            <table style="width: 100%">
                <thead>
                    <tr>
                        <th scope="col" >Hotel Location</th>
                        <th scope="col">Description</th>
                        <th scope="col">City</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelinfo().getHotelstreetaddress()%>
                        </td>
                        <!--                        <td class="item-stock">In Stock</td>-->
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelinfo().getDescription()%>
                        </td>

                        <td class="item-price">
                            <%=hotel.getOffers().getHotel().get(index).getHotelinfo().getHotelcity()%>    
                        </td>
                    </tr>
                </tbody>
            </table>
            <table style="width: 100%">
                <thead>
                    <tr>
                        <th scope="col" >Start Date</th>
                        <th scope="col">End Date</th>
                        <th scope="col">Lenght of stay</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelinfo().getTravelstartdate()%>
                        </td>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelinfo().getTravelenddate()%>
                        </td>

                        <td class="item-price"><%=hotel.getOffers().getHotel().get(index).getOfferdaterange().getLengthofstay()%></td>
                    </tr>
                </tbody>
            </table>
            <table style="width: 100%">
                <thead>
                    <tr>
                        <th scope="col">Price Details</th>
                        <th scope="col">Price</th>
                        <th scope="col">Currency</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="item-qty">
                            Original price per night
                        </td>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelpricinginfo().getOriginalpricepernight()%>
                        </td>

                        <td class="item-price">
                            <%=hotel.getOffers().getHotel().get(index).getHotelpricinginfo().getCurrency()%>    
                        </td>
                    </tr>
                    <tr>
                        <td class="item-qty">
                            Average price
                        </td>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelpricinginfo().getAveragepricevalue()%>
                        </td>

                        <td class="item-price">
                            <%=hotel.getOffers().getHotel().get(index).getHotelpricinginfo().getCurrency()%>    
                        </td>
                    </tr>
                    <tr>
                        <td class="item-qty">
                            Taxes and fees
                        </td>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelpricinginfo().getHoteltotaltaxesandfees()%>
                        </td>

                        <td class="item-price">
                            <%=hotel.getOffers().getHotel().get(index).getHotelpricinginfo().getCurrency()%>    
                        </td>
                    </tr>
                    <tr>
                        <td class="item-qty">
                            Total price
                        </td>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelpricinginfo().getTotalpricevalue()%>
                        </td>

                        <td class="item-price">
                            <%=hotel.getOffers().getHotel().get(index).getHotelpricinginfo().getCurrency()%>    
                        </td>
                    </tr>
                </tbody>
            </table>
            <table style="width: 100%">
                <thead>
                    <tr>
                        <th scope="col" >Number of booked rooms</th>
                        <th scope="col">Available rooms</th>
                        <th scope="col">Number of people viewing</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelurgencyinfo().getNumberofpeoplebooked()%>
                        </td>
                        <td class="item-qty">
                            <%=hotel.getOffers().getHotel().get(index).getHotelurgencyinfo().getNumberofroomsleft()%>
                        </td>

                        <td class="item-price">
                            <%=hotel.getOffers().getHotel().get(index).getHotelurgencyinfo().getNumberofpeopleviewing()%>    
                        </td>
                    </tr>
                </tbody>
            </table>
            <table style="width: 100%">
                <thead>
                    <tr>
                        <th scope="col" >For more details</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="item-qty">
                            <a href="<%=URLDecoder.decode(hotel.getOffers().getHotel().get(index).getHotelurls().getHotelinfositeurl())%>">Visit hotel web site</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
