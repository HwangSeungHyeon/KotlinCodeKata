//https://school.programmers.co.kr/learn/courses/30/lessons/118666
class Solution {
    //survey: 질문마다 판단하는 지표
    //choices: 질문마다 선택지를 담은 배열
    fun solution(survey: Array<String>, choices: IntArray): String {
        val score = arrayListOf(3,2,1,0,-1,-2,-3)
        var num = arrayListOf(0,0,0,0,0,0,0,0)
        
        for((idx, data) in survey.withIndex()){
            when(data[0]){
                 'R' -> {num[0] += score[choices[idx]-1]}
                 'T' -> {num[1] += score[choices[idx]-1]}
                 'C' -> {num[2] += score[choices[idx]-1]}
                 'F' -> {num[3] += score[choices[idx]-1]}
                 'J' -> {num[4] += score[choices[idx]-1]}
                 'M' -> {num[5] += score[choices[idx]-1]}
                 'A' -> {num[6] += score[choices[idx]-1]}
                 else -> {num[7] += score[choices[idx]-1]}
            }
        }
        
        var answer = StringBuilder()
        
        answer.append(if(num[0]>=num[1]) "R" else "T")
        answer.append(if(num[2]>=num[3]) "C" else "F")
        answer.append(if(num[4]>=num[5]) "J" else "M")
        answer.append(if(num[6]>=num[7]) "A" else "N")
        
        return answer.toString()
    }
}