(function(angular){
    var loginModule = angular.module('sesionModule');
    
    loginModule.service('sesionService', ['CRUDBase','sesion.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})(window.angular);
