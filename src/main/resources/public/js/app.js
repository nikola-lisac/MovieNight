angular.module("movieApp",[])
	.controller("HomeCtrl",["$http",function($http){
		var self = this;
//		$http.get("/movie").then(function(response){
//			self.movie = response.data;
//		});
//		
		
		self.searchMovie = function(){
			console.log(self.searchTitle);
			
			$http.get("/movie/"+self.searchTitle).then(function(response){
					self.movie = response.data;
					self.searchMessage = "";
			}, function(error){
				self.searchMessage = "No movie found";
				self.movie = {};
			});
		};
	}]);