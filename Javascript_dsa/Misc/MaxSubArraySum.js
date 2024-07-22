const arr = [-2, -3, 4, -1, -2, 1, 5, -3];

let sum = 0;
let max = Number.MIN_VALUE
let subArr = []
for (let i = 0; i < arr.length; i++) {
    if (sum < 0) {
        sum = 0;
        subArr = []
    }
    sum += arr[i]
    if (sum > max) {
        max = sum;
    }
    if(max >= sum){
        subArr.push(arr[i])
    }    
}

console.log(max)