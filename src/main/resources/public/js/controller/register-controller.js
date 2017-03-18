angular.module("movieApp")
	.controller("UserCtrl",["$http",function($http){
		var self = this;
		self.newuser = {
				username: "",
				password: "",
				firstName: "",
				lastName: ""
		};
		
		// work in progress checking if username exists
//		$http.get("/username", {params: {username: self.newuser.username}}).then(function(response){
//			console.log(self.newuser.username);
//			console.log(response.data);
//		});
		
		self.register = function(){
			console.log(self.newuser);
			$http.post("/user",self.newuser).then(function(response){
				self.registerMessage = "Your account has been made!"
			});
		}
	}])