(function (angular) {
    var itinerarioModule = angular.module('itinerarioModule', ['CrudModule', 'MockModule']);

    itinerarioModule.constant('itinerario.context', 'itinerario');

    itinerarioModule.constant('itinerario.skipMock', true);
	
    itinerarioModule.config(['itinerario.context', 'MockModule.urlsProvider','itinerario.skipMock', function (context, urlsProvider, skipMock) {
             urlsProvider.registerUrl(context, skipMock);
         }]);
})(window.angular);
