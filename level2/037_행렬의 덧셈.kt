//https://school.programmers.co.kr/learn/courses/30/lessons/12950
//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = Array(arr1.size,{IntArray(arr1[0].size,{0})})
        
        for((idx1,firstData) in arr1.withIndex()){
            for((idx2, data) in firstData.withIndex()){
                answer[idx1][idx2] = data+arr2[idx1][idx2]
            }
        }
        
        return answer
    }
}