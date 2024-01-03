//https://school.programmers.co.kr/learn/courses/30/lessons/42862
class Solution {
    //n = 전체 학생의 수
    //lost = 도난당한 학생들의 번호가 담긴 배열
    //reserve = 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var reserve_tmp = reserve.filterNot{lost.contains(it)}.sorted()
        var lost_tmp = lost.filterNot{reserve.contains(it)}.sorted().toCollection(ArrayList<Int>())
        var answer = n - lost_tmp.size //전체 학생 수 - 도둑질 당한 학생 수
        
        for(r in reserve_tmp){
            if(lost_tmp.contains(r-1)){ //여벌 체육복 가진 학생보다 앞 번호가 도둑질 당함
               lost_tmp.remove(r-1)
               answer++
            }
            else if(lost_tmp.contains(r+1)){ //여벌 체육복 가진 학생보다 뒷 번호가 도둑질 당함
                lost_tmp.remove(r+1)
                answer++
            }
        }
        return answer
    }
}