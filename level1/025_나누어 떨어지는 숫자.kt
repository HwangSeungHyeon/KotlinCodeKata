// https://school.programmers.co.kr/learn/courses/30/lessons/12910
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var myArr = mutableListOf<Int>() //수정 가능한 Int형 리스트

        for(i in arr){
            if(i%divisor == 0){
                myArr.add(i)
            }
        }
        
        if(myArr.size < 1){
            myArr.add(-1)
        }
        else{
            myArr.sort() // 오름차순 정렬   
        }
        return myArr.toIntArray()
    }
}