//https://school.programmers.co.kr/learn/courses/30/lessons/12926
/*어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요. */

class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        
        for(c in s){ //문자열에서 문자 하나씩 가져온다
            when(c){
                ' ' -> answer+=' '
                in 'a'..'z' ->{ //a부터 z까지
                    var asciiC = c.toInt() //아스키 코드 변환
                    if(asciiC + n > 122){ //z범위 넘어가면
                        answer += (asciiC + n - 26).toChar()
                    }
                    else{
                        answer += (asciiC+n).toChar()
                    }
                }
                in 'A'..'Z' ->{ //A부터 Z까지
                    var asciiC = c.toInt() //아스키 코드 변환
                    if(asciiC + n > 90){ //Z범위 넘어가면
                        answer += (asciiC + n - 26).toChar()
                    }
                    else{
                        answer += (asciiC+n).toChar()
                    }
                }
            }
        }
        return answer
    }
}