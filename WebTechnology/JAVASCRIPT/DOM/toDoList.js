let items = ["NoteBook", "Pen", "Laptop", "Phone", "HeadPhone"]

function renderTasks(items) {
    if (items.length === 0) {
        document.getElementById('list-items').innerHTML = "No List ...";
        return;
    }

    let eachItem = "";
    items.forEach((element, i) => {
        eachItem+= `<li class="list-inline-item mb-3 list-group-item-warning">
                    <span>${element}</span>
                    <button class="btn btn-success float-end" onclick="deleteTask(${i})">x</button>
                </li>`
    });

    document.getElementById('list-items').innerHTML = eachItem;

  
}
  function deleteTask(id) {
        items.splice('id', i);
        renderTasks(items);
    }
    renderTasks(items);
