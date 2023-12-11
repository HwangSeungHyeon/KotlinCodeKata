// https://school.programmers.co.kr/learn/courses/30/lessons/12940
/* 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.*/

class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var tmpN = n
        var tmpM = m
        var gcd = 0
        var mod = -1
        
        /*유클리드 호제법을 사용하면 최대공약수를 구할 수 있다.
        1. 큰 수를 작은 수로 나눈 후, 나머지를 구한다. (MOD 연산 수행)
        2. 1번 연산에서 나눴던 수와 1번 연산으로 구한 나머지로 다시 MOD 연산을 수행한다.
        */
        
        while(true){
            if(tmpN>tmpM){ //n이 m보다 클 경우
                mod = tmpN%tmpM //n을 m으로 나누고, 나머지를 구함
                if(mod != 0){ //나머지 연산 결과가 0이 아니라면
                    tmpN = mod //나머지 연산 결과와 tmpM이 연산 수행해야 하니까 대입해줌
                    continue
                }
                else{ //나머지 연산 결과가 0이라면
                    gcd = tmpM //나눈 수가 최대공약수
                    break
                }
            }
            else{ //m이 n보다 클 경우
                mod = tmpM%tmpN //m을 n으로 나누고, 나머지를 구함
                if(mod != 0){ //나머지 연산 결과가 0이 아니라면
                    tmpM = mod //나머지 연산 결과와 tmpM이 연산 수행해야 하니까 대입해줌
                    continue
                }
                else{//나머지 연산 결과가 0이라면
                    gcd = tmpN //나눈 수가 최대공약수
                    break
                }
            }
            
        }
        
        /*최대공약수를 이용하면 최소공배수를 구할 수 있다.
        1. 최소공배수 = 두 수의 곱 / 최대공약수
        */
        var lcd = n*m/gcd

        var answer = intArrayOf(gcd, lcd)
        return answer
    }
}