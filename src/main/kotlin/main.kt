fun main(){
    val likes = 102
    val result = if(likes%10 == 1 && !(likes%100 == 11)) "��������" else "�����"
    println("����������� $likes $result")

}