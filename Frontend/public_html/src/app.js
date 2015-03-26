(function () {

	var mainApp = angular.module('mainApp', ['ngRoute', 'sportModule', 'itineraryModule','loginModule','homeModule']);
        var itinerario = angular.module('itinerario', ['ngRoute', 'itineraryModule', 'entretenimientoModule']);
        var ciudad = angular.module('ciudad', ['ngRoute', 'ciudadModule']);
        var calification = angular.module('calification', ['ngRoute', 'calificationModule']);


        mainApp.config(['$routeProvider', function  ($routeProvider) {
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
        
	

	//Configuración módulo entretenimiento
	var entretenimientoModule = angular.module('entretenimientoModule', ['CrudModule', 'MockModule']);

	entretenimientoModule.constant('entretenimiento.context', 'entretenimiento');

	entretenimientoModule.config(['entretenimiento.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
             
         itinerario.config(['$routeProvider', function ($routeProvider) {
			$routeProvider.when('/entretenimiento', {
				templateUrl: 'src/modules/Entretenimiento/entretenimiento.tpl.html'
			}).otherwise('/');
		}]);   
        
        
         //Configuración módulo itinerary
	var itineraryModule = angular.module('itineraryModule', ['CrudModule', 'MockModule']);
	itineraryModule.constant('itinerary.context', 'itinerary');
	itineraryModule.config(['itinerary.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            
            itinerario.config(['$routeProvider', function ($routeProvider) {
                    $routeProvider.when('/itinerary', {
                            templateUrl: 'src/modules/itinerario/itinerary.tpl.html'
                    }).otherwise('/');
            }]);
        
         //Configuración módulo ciudad
	var ciudadModule = angular.module('ciudadModule', ['CrudModule', 'MockModule']);
	ciudadModule.constant('ciudad.context', 'ciudad');
	ciudadModule.config(['ciudad.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            
        ciudad.config(['$routeProvider', function ($routeProvider) {
                    $routeProvider.when('/ciudad', {
                            templateUrl: 'src/modules/ciudad/ciudad.tpl.html'
                    }).otherwise('/');
            }]);
        
        //Configuración módulo calificacion
	var ciudadModule = angular.module('calificationModule', ['CrudModule', 'MockModule']);
	ciudadModule.constant('calification.context', 'calification');
	ciudadModule.config(['calification.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            
        calification.config(['$routeProvider', function ($routeProvider) {
                    $routeProvider.when('/calification', {
                            templateUrl: 'src/modules/calification/calification.tpl.html'
                    }).otherwise('/');
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