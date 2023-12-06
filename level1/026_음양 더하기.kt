// https://school.programmers.co.kr/learn/courses/30/lessons/76501
// 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.


// 처음 풀이
// class Solution {
//     fun solution(absolutes: IntArray, signs: BooleanArray): Int {
//         var cnt : Int = 0
//         var sum : Int = 0
//         for(i in signs){
//             if(i == true){
//                 sum += absolutes[cnt]
//             }
//             else{
//                 sum -= absolutes[cnt]
//             }
//             cnt++
//         }
//         return sum
//     }
// }

//수정한 풀이
class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum : Int = 0
        for((index,item) in signs.withIndex()){
            if(item){
                sum += absolutes[index]
            }
            else{
                sum -= absolutes[index]
            }
        }
        return sum
    }
}