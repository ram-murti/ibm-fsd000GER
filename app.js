  trainer = [{
      id: '1',
      subject: 'math'


  }, {
      id: '2',
      subject: 'eng'




  }, {
      id: '3',
      subject: 'cse'


  }, {

      id: '4',
      subject: 'chem'
  }];


  subject = [

      {
          id: 'a',
          name: 'math'
      },
      {
          id: 'b',
          name: 'eng'
      },
      {
          id: 'c',
          name: 'cse'
      },
      {
          id: 'd',
          name: 'phy'
      }
  ];






  // const classA = [];
  // const loadclassb = () => {

  //     let rows = '';

  //     classA.forEach((employee) => {

  //         rows += empRow(employee);

  //     });

  //     empTable(rows);

  // }
  // const empRow = (employee) => {

  //     return `<tr>

  //         <td>${b.name}</td>

  //         <td>${b.subject}</td>

  //         <td>${b.trainer}</td>

  //         <td>${b.slot}</td>

  //     </tr> `

  // }

  const empTable = () => {
      let rows = '';
      subject.forEach((sub) => {

          rows += `<tr>
           <td>${sub.id}</td>
           <td>${sub.name}</td>

           

       </tr> `
      });

      let records = `<table>
                       <tr>
                           <th>id</th>
                           <th>name</th>
                      </tr>
                      ${rows}
                      </table>`;
      document.getElementById('AA').innerHTML = records;

  }
  const filteremps = () => {

      let rows = '';

      searchBysubject = document.getElementById('AA').value;

      trainer.filter((emp) => {

          return trainer.name == searchBysubject;

      }).forEach((su) => {

          rows += empRow(su);

      });

      empTable(rows);

  }
  const emptable = () => {
      let rows = '';
      trainer.forEach((su) => {

          rows += `<tr>
         <td>${su.id}</td>
         <td>${su.subject}</td>

         

     </tr> `
      });

      let records = `<table>
                     <tr>
                         <th>id</th>
                         <th>name</th>
                    </tr>
                    ${rows}
                    </table>`;
      document.getElementById('AA').innerHTML = records;

  }