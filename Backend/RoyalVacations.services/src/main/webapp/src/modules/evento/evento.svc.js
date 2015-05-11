(function(angular){
    var eventoModule = angular.module('eventoModule');
    
    eventoModule.service('eventoService', ['CRUDBase','evento.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})(window.angular);
