(function () {

	var mainApp = angular.module('mainApp', ['ngRoute', 'sportModule', 'itineraryModule','loginModule','homeModule']);
        var itinerario = angular.module('itinerario', ['ngRoute', 'itineraryModule']);
        
	mainApp.config(['$routeProvider', function ($routeProvider) {
			$routeProvider.when('/sport', {
				templateUrl: 'src/modules/sport/sport.tpl.html'
			}).otherwise('/');
		}]);

	//Configuración módulo sport
	var sportModule = angular.module('sportModule', ['CrudModule', 'MockModule']);

	sportModule.constant('sport.context', 'sports');

	sportModule.config(['sport.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
             
            
        itinerario.config(['$routeProvider', function ($routeProvider) {
                    $routeProvider.when('/itinerary', {
                            templateUrl: 'src/modules/itinerario/itinerary.tpl.html'
                    }).otherwise('/');
            }]);
        
         //Configuración módulo itinerary
	var itineraryModule = angular.module('itineraryModule', ['CrudModule', 'MockModule']);
	itineraryModule.constant('itinerary.context', 'itinerary');
	itineraryModule.config(['itinerary.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            
        //Configuración módulo login
	var loginModule = angular.module('loginModule', ['CrudModule', 'MockModule']);
	loginModule.constant('login.context', 'login');
	loginModule.config(['login.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            
            mainApp.config(['$routeProvider', function ($routeProvider) {
                    $routeProvider.when('/login', {
                            templateUrl: 'src/modules/login/login.html'
                    }).otherwise('/');
            }]);
        
        //Configuración módulo home
	var homeModule = angular.module('homeModule', ['CrudModule', 'MockModule']);
	homeModule.constant('home.context', 'home');
	homeModule.config(['home.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            mainApp.config(['$routeProvider', function ($routeProvider) {
                    $routeProvider.when('/home', {
                            templateUrl: 'src/modules/home/home.html'
                    }).otherwise('/');
            }]);     
})();