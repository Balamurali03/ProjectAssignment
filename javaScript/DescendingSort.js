function DescendingSort(){
let data=[1,3,4,2,5,9,0,7,6,8]
data=data.sort();
let sortData=[];
let count=0;
for(let i=data.length-1;i>=0;i--) {
    sortData[count]=data[i];
    count++;
}
console.log(sortData);
}
DescendingSort();