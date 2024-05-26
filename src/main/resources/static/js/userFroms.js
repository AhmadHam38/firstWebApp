

    $(document).ready(function () {
    // Fetch data using AJAX

    function addRow(volunteer) {
        $("#usersList").append("<tr><td>" + volunteer.volunteerID + "</td>" +
            "<td>" + volunteer.volunteerName +
            "</td><td>" + volunteer.volunteerSurName + "</td>" +
            "<td>"+volunteer.volunteerAge+"</td>" +"<td>"+volunteer.volunteerCity+"</td>"+
            "<td>"+volunteer.volunteerPhonenumber+"</td>"+
             "<td>"+volunteer.volunteerCity+"</td>"
                +"<td>"+ volunteer.schoolName+ "</td>"+
                 "<td>"+volunteer.volunteerMale+"</td>"
                  +"<td>"+ volunteer.volunteerEmail+ "</td>"+
            "<td>" +
            "<button onclick='findUserById(" + volunteer.volunteerID + ")'>" + "Profile" + "</button>" +
            "</td>"+
            "</tr>");
    }
    $.ajax({
    type: "GET",
    url: "/volunteers/getAll",
    success: function (volunteer) {
    // Iterate through the products and display them in the table
    const volunteerList = $("#volunteerList");
  volunteer.forEach(function (volunteer) {
    volunteerList.append("<tr>" +
    "<td>" + volunteer.volunteerID + "</td>"
    +"<td>"+ volunteer.volunteerName + "</td>"
    +"<td>"+ volunteer.volunteerSurName +"</td>"+
    "<td>"+ volunteer.volunteerAge+"</td>"+
    "<td>"+volunteer.volunteerCity+"</td>"
    +"<td>"+ volunteer.schoolName+ "</td>"+
     "<td>"+volunteer.volunteerMale+"</td>"
     "<td>"+volunteer.volunteerPhonenumber+"</td>"+
        +"<td>"+ volunteer.volunteerEmail+ "</td>"+

    "<td>" +
    "<button onclick='findUserById(" + volunteer.volunteerID + ")'>" + "Profile" + "</button>" +
    "</td>"
    +"</tr>");
});
},
    error: function (error) {
    console.error("Error fetching product data: ", error);
}
});

    $("#volunteerForm").submit(function (event) {
    event.preventDefault();
    let user = {
    ID: $("#volunteerID").val(),
    firstName: $("#volunteerNam").val(),
    surName: $("#volunteerSurName").val(),
    age: $("#volunteerAge").val(),
    address: $("#volunteerCity").val()
     phoneNumber: $("#volunteerPhonenumber").val(),
        gender: $("#volunteerMale").val(),
       email: $("#volunteerEmail").val()
};

    $.ajax({
    type: "POST",
    url: "/volunteer/addVolunteer",
    contentType: "application/json",
    data: JSON.stringify(volunteer),
    success: function () {
    alert("volunteer saved successfully!");
    addRow(volunteer)

},
    error: function (error) {
    console.log("Error saving person: ", error);
}
});
});
});


    function findVolunteerByID(volunteerID) {
    $.ajax({
        type: "Get",
        url: "/volunteer/findVolunteerID/"+volunteerID,
        success: function (volunteer) {
            alert("find volunteer successfully id="+volunteer.volunteerID);
            window.location.href = "/profile.html?id="+volunteer.volunteerID;//+ encodeURIComponent(volunteer.volunteerID);

        },
        error: function (error) {
            console.log("Error saving person: ", error);
        }
    });


 $(document).ready(function () {
    // Fetch data using AJAX

    function addRow(org) {
        $("#orgList").append("<tr><td>" +org.orgID + "</td>" +
            "<td>" + org.orgName +
 "<td>" + org.orgEmail +
  "<td>" + org.orgName +
  "<td>" + org.employeeName +
            "<button onclick='findOrgByID(" + org.orgID + ")'>" + "Profile" + "</button>" +
            "</td>"+
            "</tr>");
    }
}
 $.ajax({
    type: "GET",
    url: "/org/getAll",
    success: function (org) {
    // Iterate through the products and display them in the table
    const orgList = $("#orgList");
    org.forEach(function (org) {
    orgList.append("<tr>" +
    "<td>" + org.orgID + "</td>"
    +"<td>"+ org.orgName + "</td>"
  +"<td>"+ org.orgEmail + "</td>"
  +"<td>"+ org.employeeName + "</td>"
    "<td>" +
    "<button onclick='findOrgById(" +  org.orgIDD + ")'>" + "Profile" + "</button>" +
    "</td>"
    +"</tr>");
});
},

    $.ajax({
    type: "POST",
    url: "/org/addOrg",
    contentType: "application/json",
    data: JSON.stringify(org),
    success: function () {
    alert("org saved successfully!");
    addRow(org)

},
    error: function (error) {
    console.log("Error saving person: ", error);
}
});
});
});
  function findOrgById(orgID) {
    $.ajax({
        type: "Get",
        url: "/org/findOrgByID/"+orgID,
        success: function (org) {
            alert("find org successfully id="+org.orgID);
            window.location.href = "/profile.html?id="+org.orgID;//+ encodeURIComponent(org.orgID);

        },
        error: function (error) {
            console.log("Error saving person: ", error);
        }
    });


$(document).ready(function () {
    // Fetch data using AJAX

    function addRow(org) {
        $("#usersList").append("<tr><td>" + org.orgIDD + "</td>" +
            "<td>" + org.orgName +
 "<td>" + org.orgEmail +
  "<td>" + org.employeeName +
            "<button onclick='findOrgById(" + org.orgID + ")'>" + "Profile" + "</button>" +
            "</td>"+
            "</tr>");
    }
}
 $.ajax({
    type: "GET",
    url: "/admin/getAll",
    success: function (org) {
    // Iterate through the products and display them in the table
    const orgList = $("#orgList");
    org.forEach(function (org) {
    orgList.append("<tr>" +
    "<td>" +org.orgID + "</td>"
    +"<td>"+ org.orgName + "</td>"
 +"<td>"+ org.orgEmail + "</td>"
 +"<td>"+ org.employeeName + "</td>"
    "<td>" +
    "<button onclick='findAdminById(" + org.orgID + ")'>" + "Profile" + "</button>" +
    "</td>"
    +"</tr>");
});
},

    $.ajax({
    type: "POST",
    url: "/org/addOrg",
    contentType: "application/json",
    data: JSON.stringify(org),
    success: function () {
    alert("org saved successfully!");
    addRow(org)

},
    error: function (error) {
    console.log("Error saving person: ", error);
}
});
});
});
  function findOrgById(orgID) {
    $.ajax({
        type: "Get",
        url: "/admin/findOrgID/"+orgID,
        success: function (org) {
            alert("find org successfully id="+org.orgID);
            window.location.href = "/profile.html?id="+org.orgID;//+ encodeURIComponent(org.orgID);

        },
        error: function (error) {
            console.log("Error saving person: ", error);
        }
    });

    async function encryptNumber(number, key) {
        const encoder = new TextEncoder();
        const data = encoder.encode(number.toString());

        // Import the key
        const importedKey = await crypto.subtle.importKey(
            'raw',
            encoder.encode(key),
            { name: 'AES-CBC' },
            false,
            ['encrypt', 'decrypt']
        );

        // Encrypt the data
        const encryptedData = await crypto.subtle.encrypt(
            { name: 'AES-CBC', iv: crypto.getRandomValues(new Uint8Array(16)) },
            importedKey,
            data
        );

        // Convert the encrypted buffer to a hexadecimal string
        const encryptedArray = Array.from(new Uint8Array(encryptedData));
        const encryptedHex = encryptedArray.map(byte => byte.toString(16).padStart(2, '0')).join('');

        return encryptedHex;
    }

    async function decryptNumber(encryptedHex, key) {
        // Import the key
        const importedKey = await crypto.subtle.importKey(
            'raw',
            new TextEncoder().encode(key),
            { name: 'AES-CBC' },
            false,
            ['encrypt', 'decrypt']
        );

        // Convert the hexadecimal string to a buffer
        const encryptedArray = encryptedHex.match(/.{1,2}/g).map(byte => parseInt(byte, 16));
        const encryptedBuffer = new Uint8Array(encryptedArray).buffer;

        // Decrypt the data
        const decryptedData = await crypto.subtle.decrypt(
            { name: 'AES-CBC', iv: new Uint8Array(16) },
            importedKey,
            encryptedBuffer
        );

        // Decode the decrypted data
        const decryptedText = new TextDecoder().decode(decryptedData);

        return decryptedText;
    }
