(function () {

    var mainApp = angular.module('mainApp', ['ngRoute', 'itinerarioModule', 'ciudadModule','paisModule','visitaModule','loginModule']);
    var login = angular.module('login', ['ngRoute', 'sesionModule']);

    mainApp.config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/itinerarios', {
                templateUrl: 'src/modules/itinerario/itinerario.tpl.html'
            }).when('/ciudades', {
                templateUrl: 'src/modules/ciudad/ciudad.tpl.html'
            }).when('/paises', {
                templateUrl: 'src/modules/pais/pais.tpl.html'
            }).when('/visitas', {
                templateUrl: 'src/modules/visita/visita.tpl.html'
            }).when('/login', {
                templateUrl: 'src/modules/login/login.tpl.html'
            }).when('/sesion', {
                templateUrl: 'src/modules/sesion/sesion.tpl.html'
            }).otherwise('/'); 
        }]);
})();