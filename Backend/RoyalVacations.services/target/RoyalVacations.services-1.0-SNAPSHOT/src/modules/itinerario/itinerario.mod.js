(function () {
    var itinerarioModule = angular.module('itinerarioModule', ['CrudModule', 'MockModule']);

    itinerarioModule.constant('itinerario.context', 'itinerarios');

    itinerarioModule.config(['itinerario.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();