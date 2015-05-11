(function (angular) {
    var visitaModule = angular.module('visitaModule', ['CrudModule', 'MockModule','ciudadModule','itinerarioModule']);

    visitaModule.constant('visita.context', 'visita');

    visitaModule.constant('visita.skipMock', true);
	
    visitaModule.config(['visita.context', 'MockModule.urlsProvider','visita.skipMock', function (context, urlsProvider, skipMock) {
            urlsProvider.registerUrl(context, skipMock);
        }]);
})(window.angular);	