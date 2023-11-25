fun main(){
	val randomNum = (1..99).random()

	do {
		print("数字を入力して当てて下さい:\n")
		val input = readLine()!!.toInt()

		if (randomNum == input) {
			print("当たり\n")
			break
		} else if ( randomNum > input ){
			print("上です\n")
		} else {
			print("下です\n")
		}
	} while (true)

}

