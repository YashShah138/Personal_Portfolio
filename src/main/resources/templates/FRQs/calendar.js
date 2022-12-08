// function firstDayOfYear(year) {
//     fetch("/api/calendar/firstDayOfYear/" + year, {"method": "GET"})
//     // response is a RESTful "promise" on any successful fetch
//         .then(response => {
//         // check for response errors
//             if (response.status !== 200) {
//                 error("GET API response failure: " + response.status)
//                 return;  // api failure
//             }
//             // valid response will have JSON data
//             response.json().then(data => {
//                 console.log(data);
//                 document.getElementById("year").innerText = data.year;
//                 var dayOfWeek = "Sunday";
//                 if (data.firstDayOfYear == 1) {
//                 dayOfWeek = "Monday"
//                 }
//                 if (data.firstDayOfYear == 2) {
//                 dayOfWeek = "Tuesday"
//                 }
//                 if (data.firstDayOfYear == 3) {
//                 dayOfWeek = "Wednesday"
//                 }
//                 if (data.firstDayOfYear == 4) {
//                 dayOfWeek = "Thursday"
//                 }
//                 if (data.firstDayOfYear == 5) {
//                 dayOfWeek = "Friday"
//                 }
//                 if (data.firstDayOfYear == 6) {
//                 dayOfWeek = "Saturday"
//                 }
//                 document.getElementById("day").innerText = "The first day of " + data.year + " is a " + dayOfWeek;
//             })
//         })
//     // catch fetch errors (ie Nginx ACCESS to server blocked)
//     .catch(err => {
//     error(err + " " );
//     });
// }

function isLeapYear(leapyear) {
    fetch("/api/calendar/isLeapYear/" + leapyear, {"method": "GET"})
    // response is a RESTful "promise" on any successful fetch
        .then(response => {
        // check for response errors
            if (response.status !== 200) {
                error("GET API response failure: " + response.status)
                return;  // api failure
            }
            // valid response will have JSON data
            response.json().then(data => {
                console.log(data);
                var leapYear = true;
                if (data.isLeapYear == false) {
                    leapYear = "not"
                }
                document.getElementById("leap").innerText = data.leap + " is " + leapyear + " a leap year";
            })
        })
    // catch fetch errors (ie Nginx ACCESS to server blocked)
    .catch(err => {
    err(err + " " );
    });
}