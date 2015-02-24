(function () {

	var mainApp = angular.module('mainApp', ['ngRoute', 'sportModule', 'musicModule']);
        
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
            
        mainApp.config(['$routeProvider', function ($routeProvider) {
                    $routeProvider.when('/music', {
                            templateUrl: 'src/modules/music/music.tpl.html'
                    }).otherwise('/');
            }]);
            
        //Configuración módulo music
	var musicModule = angular.module('musicModule', ['CrudModule', 'MockModule']);

	musicModule.constant('music.context', 'music');

	musicModule.config(['music.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
})();