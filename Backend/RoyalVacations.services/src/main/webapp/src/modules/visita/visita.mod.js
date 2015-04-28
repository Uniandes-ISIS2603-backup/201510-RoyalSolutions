(function () {
    var visitaModule = angular.module('visitaModule', ['CrudModule', 'MockModule','ciudadModule']);

    visitaModule.constant('visita.context', 'visitas');

    visitaModule.config(['visita.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();