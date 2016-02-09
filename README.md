# Fuel-Trip
Simple Android application to find the cheapest available gas station along a route, useful for long road trips where you don't want to drive too far off the highway.  This app will also allow you to specify a range in which to get gas, so that you can factor in the amount of gas you have remaining.

## How to Make Requests
GasBuddy, the source we're using for gas prices and station locations, does not provide any sort of API.  To account for this, I have created a temporary request system that takes minimum and maximum latitude and longitude values and returns a list of primary and secondary stations within those values.  For simplicity, I have handled all the header spoofing necessary, so all that is needed is to pass the values in as GET values.  An example request would be
```
http://www.jamesnc.me/gas.php?minLat=36&maxLat=37&minLng=-82&maxLng=-81
```
which will return a JSON object of all gas stations within that area.  Google Maps provides an API, so that will be fairly straightforward.
