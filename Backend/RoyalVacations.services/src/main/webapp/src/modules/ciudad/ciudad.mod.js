(function () {
    var ciudadModule = angular.module('ciudadModule', ['CrudModule', 'MockModule','paisModule']);

    ciudadModule.constant('ciudad.context', 'ciudadess');

    ciudadModule.config(['ciudad.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();