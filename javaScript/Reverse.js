function Reverse() {
    let statement="this is a sunny day";
    statement=statement.split(" ");
    let statementArray=statement.map((word)=>{
      return word.split('').reverse().join('');
    })
    console.log(statementArray.join(' '));
    
}
Reverse();