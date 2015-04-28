(function () {
    var paisModule = angular.module('paisModule', ['CrudModule', 'MockModule']);

    paisModule.constant('pais.context', 'pais');

    paisModule.config(['pais.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();