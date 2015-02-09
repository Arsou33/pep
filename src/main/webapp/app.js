$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

$(function() {

	$("#registerForm").submit(function(e) {
		e.preventDefault()

		$.ajax({
			type: "POST",
			url: "api/user",
			contentType: "application/json; charset=utf-8",
			data: JSON.stringify($("#registerForm").serializeObject()),
			success:function() {alert('worked');}
			
		})
	})

})