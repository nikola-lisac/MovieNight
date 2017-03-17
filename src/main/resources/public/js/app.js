angular.module("movieApp",[])
	.controller("MovieCtrl",["$http",function($http){
		var self = this;
		
		self.searchMovies = function(){
			console.log(self.searchTitle);
			
			$http.get("/movies/"+self.searchTitle).then(function(response){
					console.log(response);
					console.log(response.data);
					self.movies = response.data;
					self.searchMessage = "";
			}, function(error){
				self.searchMessage = "No movies found";
				self.movies = {};
			});
		};
		
//		self.searchMovie = function(){
//			console.log(self.searchTitle);
//			
//			$http.get("/movies/"+self.searchTitle).then(function(response){
//					self.movie = response.data;
//					self.searchMessage = "";
//			}, function(error){
//				self.searchMessage = "No movie found";
//				self.movie = {};
//			});
//		};
		
	
	}]);