(function(){
    var paisModule = angular.module('paisModule');
    
    paisModule.service('paisService', ['CRUDBase','pais.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})();
