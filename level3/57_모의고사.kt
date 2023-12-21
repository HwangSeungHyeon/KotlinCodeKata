//https://school.programmers.co.kr/learn/courses/30/lessons/42840
/*수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요. */

class Solution {
    fun solution(answers: IntArray): IntArray {
        
        var score = arrayListOf(0,0,0) //각 수포자가 맞춘 개수
        
        val student1 = arrayListOf(1,2,3,4,5) //1번 수포자가 찍는 방식
        val student2 = arrayListOf(2,1,2,3,2,4,2,5) //2번 수표자가 찍는 방식
        val student3 = arrayListOf(3,3,1,1,2,2,4,4,5,5) //3번 수포자가 찍는 방식
        
        var answersIdx = 0
        var s1Idx = 0
        var s2Idx = 0
        var s3Idx = 0
        
        while(answersIdx < answers.size){
            if(s1Idx > student1.lastIndex) s1Idx = 0
            if(s2Idx > student2.lastIndex) s2Idx = 0
            if(s3Idx > student3.lastIndex) s3Idx = 0
            
            if(answers[answersIdx] == student1[s1Idx]) score[0]++
            if(answers[answersIdx] == student2[s2Idx]) score[1]++
            if(answers[answersIdx] == student3[s3Idx]) score[2]++
            
            answersIdx++
            s1Idx++
            s2Idx++
            s3Idx++
        }
        
        var answer = score.indices.filter{idx -> score[idx] == score.maxOf{it}}.toIntArray() //최대 스코어인 학생 인덱스만 가져온다
        for(i in answer.indices){
            answer[i]++
        }
        return answer
    }
}