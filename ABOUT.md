<h1>Expedia Task.</h1>

The project let you search for hotels in all over the world, using the city name and the date of start/end travel.
The hotels are filtered by star rating and can view the detials of the hotel by pressing on the button number in the same row of the hotel in the column name view hotel.<br/>
The details of the hotel contains the following:<br/>
1- The location, description and city name.<br/>
2- Start, end date and lenght of stay.<br/>
3- price details with the currency.<br/>
4- Number of booked rooms, available rooms and number of viewing people on the website.<br/>
5- hotel URL.<br/><br/>


The application built to call Json API, which include the list of hotels and the details for every hotel is exist in the list.<br/>

The following detials will show you, the steps of the process i worked on:<br/>
- Get the data from Json API:<br/>
1- Call Json API and retrieve the data.<br/>
2- View the Json tree.<br/>
3- Generate entity beans for Json Data.<br/>
4- Parse Json Data using jackson json library, which connects json beans.<br/>

- After retrieved the data in the Json using the steps of geting json data, i built JSP page, which contains the following fields:<br/>
1- City name (empty fied).<br/>
2- Start date (calender view).<br/>
3- End date (calender view).<br/>
These fileds should be filled to included in the call of Json API.<br/>

When the user filled the fields and press on search button, the JSP page forward the data in the fields to Servlet class in turn to include the data which received from JSP in call of the Json API.<br/>
The servlet will handle the Json data by using Jackson json parser and forward the object which included the parsed data to JSP page.<br/>

The JSP page will retrieve the list of hotels from the object, which received from the servlet and display the them on the page.<br/>

Every hotel in the page has the option to view the details of the hotel by pressing on the number in the view hotel column.<br/>

If the user press on the view hotel, to view the hotel details; the JSP will forward the details of the hotel to other JSP in turn to display the hotel details.



