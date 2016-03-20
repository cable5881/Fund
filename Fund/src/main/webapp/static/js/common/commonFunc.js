/*=======================================*/
/*	通用js，日后有各个页面公用的js的话，请加到这里，记得加注释！                           */
/*=======================================*/

/**
 * 将form表单的input数据序列化为json对象
 */
$.fn.serializeObject = function() {     
    var o = {};     
    var a = this.serializeArray();     
    $.each(a, function() {     
      if (o[this.name]) {     
        if (!o[this.name].push) {     
          o[this.name] = [ o[this.name] ];     
        }     
        o[this.name].push(this.value || '');     
      } else {     
        o[this.name] = this.value || '';     
      }     
    });     
    return o;     
}; 