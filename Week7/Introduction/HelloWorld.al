// Welcome to your new AL extension.
// Remember that object names and IDs should be unique across all extensions.
// AL snippets start with t*, like tpageext - give them a try and happy coding!

pageextension 50100 CustomerListExt extends "Customer List"
{
    trigger OnOpenPage();
    begin
        Message('Please write your name here: ');
        Message('Please write your favourite music too: ', 'favouriteMusic')
    end;

    var
        name: Text[20];

    var
        favouriteMusic: Text[50];
}