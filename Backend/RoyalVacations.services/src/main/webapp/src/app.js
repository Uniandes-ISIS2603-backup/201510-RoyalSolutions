(function () {

    var mainApp = angular.module('mainApp', ['ngRoute', 'itinerarioModule', 'ciudadModule','paisModule','visitaModule']);

    mainApp.config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/itinerarios', {
                templateUrl: 'src/modules/itinerario/itinerario.tpl.html'
            }).when('/ciudades', {
                templateUrl: 'src/modules/ciudad/ciudad.tpl.html'
            }).when('/paises', {
                templateUrl: 'src/modules/pais/pais.tpl.html'
            }).when('/visitas', {
                templateUrl: 'src/modules/visita/visita.tpl.html'
            }).otherwise('/');         
        }]);
})();