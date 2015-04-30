(function (angular) {
    var paisModule = angular.module('paisModule', ['CrudModule', 'MockModule']);

    paisModule.constant('pais.context', 'pais');

    paisModule.constant('pais.skipMock', true);
	
	     paisModule.config(['pais.context', 'MockModule.urlsProvider','pais.skipMock', function (context, urlsProvider, skipMock) {
	             urlsProvider.registerUrl(context, skipMock);
	         }]);
})(window.angular);
