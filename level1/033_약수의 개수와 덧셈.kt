//https://school.programmers.co.kr/learn/courses/30/lessons/77884
/*두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.*/

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer = 0        
        for(num in left..right){ //left에서 right까지의 모든 수 중에서
            var cnt = 0
            for(i in 1..num){ //약수 구하기 위해서 반복문 사용
                if(num%i==0) cnt++ //약수일 경우 cnt 값 증가
            }
            if(cnt%2==0) answer+=num //약수 개수가 짝수인 수는 더하고
            else answer-=num //약수 개수가 홀수인 수는 뺀다
        }
        return answer
    }
}