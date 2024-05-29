function solution(num_list, n) {
  return num_list.slice(0, n);
}

// // 나의 풀이
// function solution(num_list, n) {
//   let answer = [];
//   let count = 0;
//   for (const element of num_list ) {
//       if (count > n-1) break;
//       answer.push(element);
//       count++;
//   }
//   return answer;
// }
