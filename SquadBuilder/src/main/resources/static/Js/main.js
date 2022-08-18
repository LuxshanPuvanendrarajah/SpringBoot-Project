"use strict";
// Selectors

// Divs
let fwdDiv = document.querySelector("#fwd-div");
let midDiv = document.querySelector("#mid-div");
let defDiv = document.querySelector("#def-div");
let subDiv = document.querySelector("#sub-div");
let gkDiv = document.querySelector("#gk-div");

// Inputs
let idInput = document.querySelector("#idInput");
let fNameInput = document.querySelector("#firstNameInput");
let lNameInput = document.querySelector("#lastNameInput");
let ageInput = document.querySelector("#ageInput");
let positionInput = document.querySelector("#positionInput");
let linkInput = document.querySelector("#linkInput");



// Buttons
let createBtn = document.querySelector("#createBtn");
let upd1Btn = document.querySelector("#upd1");
// Functions


let printResults1 = (forward) => {
    
    let entryParent = document.createElement("div");
    entryParent.setAttribute("class", "card mb-3");
    entryParent.setAttribute("Style", "max-width:540px");
    
    
    let entryUnit = document.createElement("div");
    entryUnit.setAttribute("class","row g-0");

    let entryDiv = document.createElement("div");
    entryDiv.setAttribute("class","col-md-4");

    let entryImage =
    document.createElement("IMG");
    entryImage.setAttribute("src",`${forward.link}`);
    entryImage.setAttribute("class","img-fluid rounded-start");
    entryImage.setAttribute("alt",`${forward.firstName}${forward.lastName}`);
    
    
    let entryDiv1 = document.createElement("div");
    entryDiv1.setAttribute("class","col-md-8");

    let entryBody = document.createElement("div");
    entryBody.setAttribute("class","card-body");
   
    let entryH4 =document.createElement("h4");
    entryH4.setAttribute("class","card-title");
    entryH4.textContent =` ${forward.firstName} ${forward.lastName}`;

    let entryH6 = document.createElement("h5");
    entryH6.setAttribute("class","card-text");
    entryH6.textContent =`ID: ${forward.id} | Age: ${forward.age}`;
    
    
    let delBtn = document.createElement("button");
    delBtn.textContent = "Delete";
    delBtn.type = "button";
    delBtn.setAttribute("Class", "btn btn-danger btn-sm");
    delBtn.setAttribute("onClick", `del(${forward.id})`);

    let updBtn = document.createElement("button");
    updBtn.textContent = "Edit";
    updBtn.type = "button";
    updBtn.setAttribute("Class", "btn btn-warning btn-sm");
    updBtn.setAttribute("style","margin-right:10px")
    updBtn.setAttribute("onClick",`formpop(${forward.id})`);

    entryParent.appendChild(entryUnit);
    entryUnit.appendChild(entryDiv);
    entryDiv.appendChild(entryImage);
    entryUnit.appendChild(entryDiv1);
    entryDiv1.appendChild(entryBody);
    entryBody.appendChild(entryH4);
    entryBody.appendChild(entryH6);
    entryBody.appendChild(updBtn);
    entryBody.appendChild(delBtn);
    fwdDiv.appendChild(entryParent);
}

let printResults2 = (mid) => {

    let entryParent = document.createElement("div");
    entryParent.setAttribute("class", "card mb-3");
    entryParent.setAttribute("Style", "max-width:540px");
    
    
    let entryUnit = document.createElement("div");
    entryUnit.setAttribute("class","row g-0");

    let entryDiv = document.createElement("div");
    entryDiv.setAttribute("class","col-md-4");

    let entryImage =
    document.createElement("IMG");
    entryImage.setAttribute("src",`${mid.link}`);
    entryImage.setAttribute("class","img-fluid rounded-start");
    entryImage.setAttribute("alt",`${mid.firstName}${mid.lastName}`);
    
    
    let entryDiv1 = document.createElement("div");
    entryDiv1.setAttribute("class","col-md-8");

    let entryBody = document.createElement("div");
    entryBody.setAttribute("class","card-body");
   
    let entryH4 =document.createElement("h4");
    entryH4.setAttribute("class","card-title");
    entryH4.textContent =` ${mid.firstName} ${mid.lastName}`;

    let entryH6 = document.createElement("h5");
    entryH6.setAttribute("class","card-text");
    entryH6.textContent =`ID: ${mid.id} | Age: ${mid.age}`;
    
    
    let delBtn = document.createElement("button");
    delBtn.textContent = "Delete";
    delBtn.type = "button";
    delBtn.setAttribute("Class", "btn btn-danger btn-sm");
    delBtn.setAttribute("onClick", `del(${mid.id})`);

    let updBtn = document.createElement("button");
    updBtn.textContent = "Edit";
    updBtn.type = "button";
    updBtn.setAttribute("Class", "btn btn-warning btn-sm");
    updBtn.setAttribute("style","margin-right:10px")
    updBtn.setAttribute("onClick",`formpop(${mid.id})`);

    entryParent.appendChild(entryUnit);
    entryUnit.appendChild(entryDiv);
    entryDiv.appendChild(entryImage);
    entryUnit.appendChild(entryDiv1);
    entryDiv1.appendChild(entryBody);
    entryBody.appendChild(entryH4);
    entryBody.appendChild(entryH6);
    entryBody.appendChild(updBtn);
    entryBody.appendChild(delBtn);
    midDiv.appendChild(entryParent);
}

let printResults3 = (def) => {
    let entryParent = document.createElement("div");
    entryParent.setAttribute("class", "card mb-3");
    entryParent.setAttribute("Style", "max-width:540px");
    
    
    let entryUnit = document.createElement("div");
    entryUnit.setAttribute("class","row g-0");

    let entryDiv = document.createElement("div");
    entryDiv.setAttribute("class","col-md-4");

    let entryImage = document.createElement("IMG");
    entryImage.setAttribute("src",`${def.link}`);
    entryImage.setAttribute("class","img-fluid rounded-start");
    entryImage.setAttribute("alt",`${def.firstName}${def.lastName}`);
    
    
    let entryDiv1 = document.createElement("div");
    entryDiv1.setAttribute("class","col-md-8");

    let entryBody = document.createElement("div");
    entryBody.setAttribute("class","card-body");
   
    let entryH4 =document.createElement("h4");
    entryH4.setAttribute("class","card-title");
    entryH4.textContent =` ${def.firstName} ${def.lastName}`;

    let entryH6 = document.createElement("h5");
    entryH6.setAttribute("class","card-text");
    entryH6.textContent =`ID: ${def.id} | Age: ${def.age}`;
    
    
    let delBtn = document.createElement("button");
    delBtn.textContent = "Delete";
    delBtn.type = "button";
    delBtn.setAttribute("Class", "btn btn-danger btn-sm");
    delBtn.setAttribute("onClick", `del(${def.id})`);


    
    let updBtn = document.createElement("button");
    updBtn.textContent = "Edit";
    updBtn.type = "button";
    updBtn.setAttribute("Class", "btn btn-warning btn-sm");
    updBtn.setAttribute("style","margin-right:10px");
    updBtn.setAttribute("onClick",`formpop(${def.id})`);

    entryParent.appendChild(entryUnit);
    entryUnit.appendChild(entryDiv);
    entryDiv.appendChild(entryImage);
    entryUnit.appendChild(entryDiv1);
    entryDiv1.appendChild(entryBody);
    entryBody.appendChild(entryH4);
    entryBody.appendChild(entryH6);
    entryBody.appendChild(updBtn);
    entryBody.appendChild(delBtn);
    defDiv.appendChild(entryParent);
    
   
}

let printResults4 = (gk) => {
    let entryParent = document.createElement("div");
    entryParent.setAttribute("class", "card mb-3");
    entryParent.setAttribute("Style", "max-width:540px");
    
    
    let entryUnit = document.createElement("div");
    entryUnit.setAttribute("class","row g-0");

    let entryDiv = document.createElement("div");
    entryDiv.setAttribute("class","col-md-4");

    let entryImage =
    document.createElement("IMG");
    entryImage.setAttribute("src",`${gk.link}`);
    entryImage.setAttribute("class","img-fluid rounded-start");
    entryImage.setAttribute("alt",`${gk.firstName}${gk.lastName}`);
    
    
    let entryDiv1 = document.createElement("div");
    entryDiv1.setAttribute("class","col-md-8");

    let entryBody = document.createElement("div");
    entryBody.setAttribute("class","card-body");
   
    let entryH4 =document.createElement("h4");
    entryH4.setAttribute("class","card-title");
    entryH4.textContent =` ${gk.firstName} ${gk.lastName}`;

    let entryH6 = document.createElement("h5");
    entryH6.setAttribute("class","card-text");
    entryH6.textContent =`ID: ${gk.id} | Age: ${gk.age}`;
    
    
    let delBtn = document.createElement("button");
    delBtn.textContent = "Delete";
    delBtn.type = "button";
    delBtn.setAttribute("Class", "btn btn-danger btn-sm");
    delBtn.setAttribute("onClick", `del(${gk.id})`);

    let updBtn = document.createElement("button");
    updBtn.textContent = "Edit";
    updBtn.type = "button";
    updBtn.setAttribute("Class", "btn btn-warning btn-sm");
    updBtn.setAttribute("style","margin-right:10px");
    updBtn.setAttribute("onClick",`formpop(${gk.id})`);

    entryParent.appendChild(entryUnit);
    entryUnit.appendChild(entryDiv);
    entryDiv.appendChild(entryImage);
    entryUnit.appendChild(entryDiv1);
    entryDiv1.appendChild(entryBody);
    entryBody.appendChild(entryH4);
    entryBody.appendChild(entryH6);
    entryBody.appendChild(updBtn);
    entryBody.appendChild(delBtn);
    gkDiv.appendChild(entryParent);
}
let printResults5 = (sub) => {
    let entryParent = document.createElement("div");
    entryParent.setAttribute("class", "card mb-8");
    entryParent.setAttribute("Style", "max-width:540px");
    
    
    let entryUnit = document.createElement("div");
    entryUnit.setAttribute("class","row g-0");

    let entryDiv = document.createElement("div");
    entryDiv.setAttribute("class","col-md-4");

    let entryImage =
    document.createElement("IMG");
    entryImage.setAttribute("src",`${sub.link}`);
    entryImage.setAttribute("class","img-fluid rounded-start");
    entryImage.setAttribute("alt",`${sub.firstName}${sub.lastName}`);
    
    
    let entryDiv1 = document.createElement("div");
    entryDiv1.setAttribute("class","col-md-8");

    let entryBody = document.createElement("div");
    entryBody.setAttribute("class","card-body");
   
    let entryH4 =document.createElement("h4");
    entryH4.setAttribute("class","card-title");
    entryH4.textContent =` ${sub.firstName} ${sub.lastName}`;

    let entryH6 = document.createElement("h5");
    entryH6.setAttribute("class","card-text");
    entryH6.textContent =`ID: ${sub.id} | Age: ${sub.age}`;
    
    
    let delBtn = document.createElement("button");
    delBtn.textContent = "Delete";
    delBtn.type = "button";
    delBtn.setAttribute("Class", "btn btn-danger btn-sm");
    delBtn.setAttribute("onClick", `del(${sub.id})`);

    let updBtn = document.createElement("button");
    updBtn.textContent = "Edit";
    updBtn.type = "button";
    updBtn.setAttribute("id", `${sub.id}`);
    updBtn.setAttribute("Class", "btn btn-warning btn-sm");
    updBtn.setAttribute("style","margin-right:10px")
    updBtn.setAttribute("onClick",`formpop(${sub.id})`);

    entryParent.appendChild(entryUnit);
    entryUnit.appendChild(entryDiv);
    entryDiv.appendChild(entryImage);
    entryUnit.appendChild(entryDiv1);
    entryDiv1.appendChild(entryBody);
    entryBody.appendChild(entryH4);
    entryBody.appendChild(entryH6);
    entryBody.appendChild(updBtn);
    entryBody.appendChild(delBtn);
    subDiv.appendChild(entryParent);
}


//function
let getAll =()=>{
    axios.get("http://localhost:8080/squad/getAll")
    .then(res => {
        let results = res.data;
        for(let result of results){
            console.log(result);
        }
    
    })
    .catch(err => {console.log(err); }
    );
}
let getForwardAll =()=>{
    axios.get("http://localhost:8080/squad/getAll")
    .then(res => {
        let results = res.data;
        for(let forward of results){
            if(forward.position === "FORWARD"){
            printResults1(forward);
            }}})
            .catch(err => {console.log(err); });
}
let getMidAll =()=>{
    axios.get("http://localhost:8080/squad/getAll")
    .then(res => {
        let results = res.data;
        for(let  mid of results){
            if(mid.position === "MIDFIELDER"){
            printResults2(mid);
            }}})
            .catch(err => {console.log(err); });
}
let getDefAll =()=>{
    axios.get("http://localhost:8080/squad/getAll")
    .then(res => {
        let results = res.data;
        for(let def of results){
            if(def.position === "DEFENDER"){
            printResults3(def);
            }}})
            .catch(err => {console.log(err); });
}
let getGkAll =()=>{
    axios.get("http://localhost:8080/squad/getAll")
    .then(res => {
        let results = res.data;
        for(let  gk of results){
            if(gk.position === "GOALKEEPER"){
            printResults4(gk);
            }}})
            .catch(err => {console.log(err); });
}
let getSubAll =()=>{
    axios.get("http://localhost:8080/squad/getAll")
    .then(res => {
        let results = res.data;
        for(let  sub of results){
            if(sub.position === "SUBSTITUTE"){
            printResults5(sub);
            }}})
            .catch(err => {console.log(err); });
}

let create = () => {

    let obj = {
        "firstName": fNameInput.value,
        "lastName": lNameInput.value,
        "age": ageInput.value,
        "link":linkInput.value,
        "position":positionInput.value
    }

    axios.post("http://localhost:8080/squad/create", obj)
    .then(res => {
        getAll() ,location.reload() ;
    }).catch(err => {console.log(err);});

}
let update = () => {
    let obj = {
        "firstName": fNameInput.value,
        "lastName": lNameInput.value,
        "age": ageInput.value,
        "link":linkInput.value,
        "position":positionInput.value
    }
    
    axios.put(`http://localhost:8080/squad/update/${idInput.value}`, obj)
        .then((resp) => {
            getAll();
        }).catch((err) => {console.error(err);})
        
        div_hide();
        location.reload() 
}
let del = (id) => {

    axios.delete(`http://localhost:8080/squad/delete/${id}`)
        .then((resp) => {
            getAll();
        }).catch((err) => {console.log(err);})
        location.reload() 
}


// Listeners
createBtn.addEventListener("click", create);
upd1Btn.addEventListener("click", update);



let formpop = (id) => {
    axios.get(`http://localhost:8080/squad/getByID/${id}`)
        .then((res) => {
            let results = res.data;
            idInput.value=results.id;
            fNameInput.value = results.firstName;
            lNameInput.value = results.lastName;
            ageInput.value=results.age;
            linkInput.value=results.link;
            positionInput.value= results.position;
        

        }).catch((err) => { console.log(err); });
        div_show();

}
let div_hide = () => {
    
    document.getElementById('upd1').style.display = "none";
}
let div_show = () => {
    document.getElementById('upd1').style.display = "inline-grid";
}