package tech.takenoko.entity

//@Entity
//@Table(name="users")
class UserDto constructor( _id: Long, _name: String?, _password: String? ) {
	var id = _id
	var name = _name
	var password = _password
}

