package tech.takenoko.util

object Util {

	fun getClassName(): String {
		return Thread.currentThread().getStackTrace()[2].getClassName();
	}
}